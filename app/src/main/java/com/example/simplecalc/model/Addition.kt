package com.example.simplecalc.model

class Addition : Operation() {
    override fun getOperationResult(preservedOperand: Double, currentOperand: Double): Double {
        return preservedOperand + currentOperand
    }
}