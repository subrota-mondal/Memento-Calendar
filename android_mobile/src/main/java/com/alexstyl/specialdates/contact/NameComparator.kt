package com.alexstyl.specialdates.contact

import com.alexstyl.gsc.SoundComparer

object NameComparator {

    fun areTheSameName(left: String, right: String): Boolean {
        try {
            return SoundComparer.soundTheSame(left, right)
        } catch (e: Exception) {
            e.printStackTrace()
            return false
        }

    }

}
