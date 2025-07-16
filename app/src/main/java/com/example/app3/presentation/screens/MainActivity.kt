package com.example.app3.presentation.screens

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.ElevatedCard
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.app3.R
import com.example.app3.presentation.components.TableCellText
import com.example.app3.presentation.viewmodels.ActivityViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Table()
        }
    }
}

@Composable
fun Table(viewModel: ActivityViewModel = hiltViewModel()) {

    val productData = viewModel.productData.value

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxSize()
    ) {
        ElevatedCard(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 10.dp)
                .height(170.dp),
            colors = CardDefaults.cardColors(containerColor = Color.White)
        ) {
            Column(
                modifier = Modifier
                    .padding(16.dp)
                    .fillMaxSize()
                    .background(Color.White, shape = RoundedCornerShape(16.dp))
                    .border(1.dp, colorResource(R.color.light), shape = RoundedCornerShape(16.dp)),
            ) {
                Row(
                    Modifier
                        .fillMaxWidth()
                        .padding(12.dp),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    TableCellText(
                        text = "Kateqoriya",
                        modifier = Modifier.weight(1f),
                        color = colorResource(R.color.blue)
                    )
                    TableCellText(
                        text = "Miqdar",
                        modifier = Modifier.weight(1f),
                        color = colorResource(R.color.blue)
                    )
                    TableCellText(
                        text = "Ölçü vahidi",
                        modifier = Modifier.weight(1f),
                        color = colorResource(R.color.blue)
                    )
                }


                Divider()

                productData.forEach { item ->
                    Row(
                        Modifier
                            .fillMaxWidth()
                            .padding(vertical = 12.dp, horizontal = 12.dp),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        TableCellText(
                            text = item.category,
                            modifier = Modifier.weight(1f),
                            fontWeight = FontWeight.Bold
                        )
                        TableCellText(
                            text = "${item.amount}",
                            modifier = Modifier.weight(1f),
                            fontWeight = FontWeight.Bold
                        )
                        TableCellText(
                            text = item.unit,
                            modifier = Modifier.weight(1f),
                            fontWeight = FontWeight.Bold
                        )
                    }

                    if (productData.last() != item) {
                        Divider()
                    }
                }

            }
        }
    }


}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {

    Table()

}