package ro.telacad.ktplayground.basics.generics

import java.math.BigDecimal

// class hierarchy

sealed class Item(
    open val brand: String
)

data class TV(
    override val brand: String
) : Item(brand)

data class Computer(
    override val brand: String,
    val ramMemory: Int
) : Item(brand)

data class Phone(
    override val brand: String,
    val model: String
) : Item(brand)

interface Retailer<out T> {
    fun sell(): T
}

class TVRetailer : Retailer<TV> {
    override fun sell(): TV {
        return TV("Samsung")
    }
}

class PhoneRetailer : Retailer<Phone> {
    override fun sell(): Phone {
        return Phone("Apple", "Iphone 11")
    }
}

class ComputerRetailer : Retailer<Computer> {
    override fun sell(): Computer {
        return Computer("Apple MacBook Pro", 16)
    }
}

class CategoryOwner<in T : Item> {
    fun removeItem(item: T) {
        println("Just removed $item")
    }

    fun addItem(item: T, price: BigDecimal) {
        println("Just added $item with price $price")
    }
}

class ItemMarketCategory<T : Item>(
    private val categoryOwner: CategoryOwner<T>
) {
    val prices: MutableMap<T, BigDecimal> = mutableMapOf()

    fun addPrice(item: T, price: BigDecimal) {
        categoryOwner.addItem(item, price)
        prices[item] = price
    }

    fun removeItem(item: T) {
        categoryOwner.removeItem(item)
        prices.remove(item)
    }
}

fun main() {
    /**
     * Covariance
     */
    val tvRetailer = TVRetailer()
    val phoneRetailer: Retailer<Phone> = PhoneRetailer()

// As Item is the supertype of TV we are expecting that the following declaration to be valid.
// In order to be able to compile this code we should use the `out` keyword and to transform
//    the `T` generic type parameter into a covariant one.

    val covariantTvRetailer: Retailer<Item> = TVRetailer() // compile-time error


    /**
     * Contravariance
     */

    val computerCategoryOwner = CategoryOwner<Computer>()
    val tvCategoryOwner = CategoryOwner<TV>()
    val tvMarketCategoryOwner = ItemMarketCategory<TV>(tvCategoryOwner)
    tvMarketCategoryOwner.addPrice(TV("Samsung"), BigDecimal(1000))
    tvMarketCategoryOwner.addPrice(TV("LG"), BigDecimal(900))
    val computerMarketCategory = ItemMarketCategory<Computer>(computerCategoryOwner)
    computerMarketCategory.addPrice(Computer("Apple", 16), BigDecimal.valueOf(2300))
    computerMarketCategory.addPrice(Computer("HP", 32), BigDecimal.valueOf(1800))

    val phoneCategoryOwner = CategoryOwner<Item>()

// As Item is the supertype of Phone we are expecting that the following declaration to be valid.
// In order to be allowed to compile this code we should use the `in` keyword and to transform
//      the `T` generic type parameter of class CategoryOwner<T> into a contravariant one.

    val phoneMarketCategory = ItemMarketCategory<Phone>(phoneCategoryOwner) // compile-time error


}
