package com.cb.myapplication

object PreviewData {

    private const val brand = "https://imagenes.elpais.com/resizer/JrqF-huYE1uLU2kHRN-B489D_zs=/980x980/filters:focal(2464x333:2474x343)/cloudfront-eu-central-1.images.arcpublishing.com/prisa/UNPXMS3K45E4BN75UMZNXHNXTU.jpg"

    private val images = listOf(
        "https://cdn.stillwhite.com/assets/c2/df/fb/c2dffbe253d011eb85eb068d169f9261/1600x.jpg",
        "https://www.theknot.com/tk-media/images/4de65d71-0906-49f8-9ac4-c33d86cce030",
        "https://cdn.stillwhite.com/assets/c2/df/fb/c2dffbe253d011eb85eb068d169f9261/1600x.jpg",
        "https://i.pinimg.com/474x/c9/4b/d6/c94bd6ac5d6952a7d69c379fb6407a47.jpg",
        "https://i.pinimg.com/236x/c2/4b/56/c24b56698ebf46544e3433744c4a3f44.jpg",
        "https://i.pinimg.com/236x/91/08/7a/91087a829e4775c2cf187c6661866d6b.jpg",
        "https://i.pinimg.com/236x/56/15/1b/56151be69970d4e02c87d8fb6ba8c460.jpg",
        "https://i.pinimg.com/236x/13/28/30/132830d246730b43b78eae7ef9e56b79.jpg",
        "https://i.pinimg.com/236x/50/3a/c1/503ac129a24e442a8b9d1910e56d8c8d.jpg",
        "https://i.pinimg.com/236x/8c/91/ce/8c91ce1d85efa808bcab79c604724875.jpg",
        "https://i.pinimg.com/236x/ed/d9/bb/edd9bb2e5b08e9a061da4246886b0379.jpg",
        "https://i.pinimg.com/236x/2e/c9/85/2ec98542eb2bbfb30546da6a73399c7e.jpg",
        "https://i.pinimg.com/236x/4d/a2/3d/4da23d63db75a3cb4aff974fcd879400.jpg",
    )

    val dresses = listOf(
        DressData(
            headerUrl = "",
            primaryUrl = "",
            secondaryUrl = "",
            brandUrl = "",
            brandName = "Eleganza",
            brandLocation = "Milan, Italy",
            description = "Sophisticated evening gown featuring a deep V-neck, flowing skirt, and intricate beadwork on the bodice, perfect for any formal event.",
            price = "$1,200"
        ),
        DressData(
            headerUrl = "",
            primaryUrl = "",
            secondaryUrl = "",
            brandUrl = "",
            brandName = "Vivace",
            brandLocation = "Paris, France",
            description = "Elegant cocktail dress with a sleek silhouette, high neckline, and delicate lace detailing, ideal for cocktail parties and evening functions.",
            price = "$850"
        ),
        DressData(
            headerUrl = "",
            primaryUrl = "",
            secondaryUrl = "",
            brandUrl = "",
            brandName = "ModaRetro",
            brandLocation = "London, UK",
            description = "Vintage-inspired midi dress with a flared skirt, cinched waist, and polka dot print, perfect for daytime events or casual outings.",
            price = "$650"
        ),
        DressData(
            headerUrl = "",
            primaryUrl = "",
            secondaryUrl = "",
            brandUrl = "",
            brandName = "GlamourNight",
            brandLocation = "New York, USA",
            description = "Stunning ball gown with a full tulle skirt, fitted bodice, and sparkling sequin embellishments, ideal for gala nights and formal gatherings.",
            price = "$1,500"
        ),
        DressData(
            headerUrl = "",
            primaryUrl = "",
            secondaryUrl = "",
            brandUrl = "",
            brandName = "Soleil",
            brandLocation = "Barcelona, Spain",
            description = "Light and breezy summer dress with a floral print, sleeveless design, and ruffled hem, perfect for beach days or summer picnics.",
            price = "$300"
        )
    ).map {
        val shuffled = images.shuffled()
        it.copy(
            headerUrl = shuffled[0],
            primaryUrl = shuffled[1],
            secondaryUrl = shuffled[2],
            brandUrl = brand
        )
    }.shuffled()

}