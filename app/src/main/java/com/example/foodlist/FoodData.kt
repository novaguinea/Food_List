package com.example.foodlist

object FoodData {

    private val foodTitle = arrayOf(
        "Brownies",
        "Berry Muffin",
        "Chocolate Cake",
        "Chocolate Muffin",
        "Donut",
        "Funfetti Cupcake",
        "Lemon Cupcake",
        "Pancakes",
        "Cinnamon Rolls"
    )

    private val foodDetails = arrayOf(
        "Fudgy chocolate cake. It forms from flour, eggs, chocolate (ofc), and butter.",
        "Muffin topped with fresh berries.",
        "An ordinary chocolate cake, but usually exist on a special day!",
        "One of my favorite, but i prefer triple choco.",
        "One of my favorite too! Everyone's favorite!",
        "This cupcake has colorful sprinkles on the batter who make it looks mesmerizing!",
        "The acid from lemon make it more fresh and unusual taste than any cake.",
        "Good for breakfast, not too heavy or too light just enough!",
        "Sweet and have a warm scent."
    )

    private val foodImg = intArrayOf(
        R.drawable.brownies_img,
        R.drawable.berrymuffins_img,
        R.drawable.chococake_img,
        R.drawable.muffins_img,
        R.drawable.donuts_img,
        R.drawable.funfetticc_img,
        R.drawable.lemoncc_img,
        R.drawable.pancake_img,
        R.drawable.cinnamonroll_img
    )

    val listData: ArrayList<Food>
        get() {
            val list = arrayListOf<Food>()
            for (position in foodTitle.indices) {
                val food = Food()
                food.name = foodTitle[position]
                food.detail = foodDetails[position]
                food.pict = foodImg[position]
                list.add(food)
            }
            return list
        }


}