package ru.netology

import java.math.RoundingMode

fun main() {

    val amount = 5_555_55
    val commission = 0.75
    var paymentFee = (amount / 100 * commission)

    if (paymentFee < 3500) paymentFee = 3500.00

    // Вывод комиссии сделаем в рублях
    println(
        "Комиссия за оплату = " + (paymentFee / 100).toBigDecimal().setScale(2, RoundingMode.HALF_UP)
            .toDouble() + " руб."
    )

}