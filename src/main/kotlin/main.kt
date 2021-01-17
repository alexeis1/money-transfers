//package ru.netology.lesson2
/**
 * Description
 * Домашнее задание к занятию «1.2. Отличия от Java: immutability,
 * переменные, типы данных, операторы и приведение типов»
 * Задача №1 - Денежные переводы
 */

fun main()
{
    //используем var поскольку ожидаем, что данные заранее не известны
    //и придут в качестве аргумента в функцию 34034р 46коп
    var amount = 3_430_446L
    //комиссия не меняется от транзакции к транзакции, поэтому является immutable
    //в контексте данной задчи
    val minCommission = 3_500L //35р 00 коп
    val commission    = 0.75F  //0.75%
    //расчет комиссии
    var resultKop = (amount * commission / 100.0F).toLong()
    if (resultKop < minCommission)
        resultKop = minCommission

    println("Коммиссия за перевод в ${amount    / 100} рублей ${amount    % 100} копеек составит: " +
                                   "${resultKop / 100} рублей ${resultKop % 100} копеек}")
}