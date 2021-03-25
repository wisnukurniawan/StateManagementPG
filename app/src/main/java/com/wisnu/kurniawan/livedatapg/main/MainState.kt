package com.wisnu.kurniawan.livedatapg.main

import com.wisnu.kurniawan.livedatapg.base.State

data class MainState(
    val flag1: Boolean = false,
    val flag2: Boolean = false
) : State
