package com.example.hataru.domain.entity

data class RoomX(
    val id: Int,
    val account_id: Int,
    val parent_id: Int,
    val name: String,
    val description: String,
    val adults: Int,
    val children: Int,
    val photos: List<Photo>?,
    val order: Int,
    val accommodation_type: Int,
    val bed_variant: Any?,
    val youtube_url: Any?,
    val amenities: Map<String, X1>,
    val extra_array: Any?,
    val name_ru: String?,
    val name_en: String,
    val name_de: String,
    val name_zh: String,
    val name_es: String,
    val name_fr: String,
    val name_ja: String,
    val name_it: String,
    val name_ko: String,
    val name_pl: String,
    val name_fi: String,
    val name_lt: String,
    val name_ro: String,
    val name_lv: String,
    val name_uk: String,
    val name_hy: String,
    val description_ru: String,
    val description_en: String,
    val description_de: String,
    val description_zh: String,
    val description_es: String,
    val description_fr: String,
    val description_ja: String,
    val description_it: String,
    val description_ko: String,
    val description_pl: String,
    val description_fi: String,
    val description_lt: String,
    val description_ro: String,
    val description_lv: String,
    val description_uk: String,
    val description_hy: String
)