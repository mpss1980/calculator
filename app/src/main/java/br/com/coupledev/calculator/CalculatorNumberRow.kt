package br.com.coupledev.calculator

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import br.com.coupledev.calculator.ui.theme.MediumGray
import br.com.coupledev.calculator.ui.theme.Orange

@Composable
fun CalculatorNumberRow(
    symbols: List<String>,
    operationSymbol: String,
    viewModel: CalculatorViewModel,
    calculatorOperation: CalculatorOperation
) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(8.dp),
    ) {
        CalculatorButton(
            symbol = symbols[0],
            color = MediumGray,
            modifier = Modifier
                .aspectRatio(1f)
                .weight(1f)
        ) {
            viewModel.onAction(CalculatorAction.Number(symbols[0].toInt()))
        }
        CalculatorButton(
            symbol = symbols[1],
            color = MediumGray,
            modifier = Modifier
                .aspectRatio(1f)
                .weight(1f)
        ) {
            viewModel.onAction(CalculatorAction.Number(symbols[1].toInt()))
        }
        CalculatorButton(
            symbol = symbols[2],
            color = MediumGray,
            modifier = Modifier
                .aspectRatio(1f)
                .weight(1f)
        ) {
            viewModel.onAction(CalculatorAction.Number(symbols[2].toInt()))
        }
        CalculatorButton(
            symbol = operationSymbol,
            color = Orange,
            modifier = Modifier
                .aspectRatio(1f)
                .weight(1f)
        ) {
            viewModel.onAction(CalculatorAction.Operation(calculatorOperation))
        }
    }
}