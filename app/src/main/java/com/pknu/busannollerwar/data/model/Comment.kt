package com.pknu.busannollerwar.data.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Comment(
    @SerialName("comment_id") val commentId: Int,
    @SerialName("post_id") val postId: Int,
    @SerialName("user_id") val userId: String,
    @SerialName("comment_content") val commentContent: String,
    @SerialName("created_date") val createdDate: String,
    @SerialName("modified_date") val modifiedDate: String,
    @SerialName("star_cnt") val starCount: Int,
)