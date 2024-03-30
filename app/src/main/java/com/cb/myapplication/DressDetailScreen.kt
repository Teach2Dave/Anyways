package com.cb.myapplication

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage

private val PrimaryColor = Color(0xFF6200EE)
@Composable
fun DressDetailScreen(
    dressData: DressData,
    onRentClicked: () -> Unit,
    onInfoClicked: () -> Unit
) {
    Column {
        Header(dressData, Modifier.weight(1.0f))
        Container(dressData, Modifier, onRentClicked, onInfoClicked)
    }
}

@Composable
fun Container(
    dressData: DressData,
    modifier: Modifier,
    onRentClicked: () -> Unit,
    onInfoClicked: () -> Unit
) {
    Column(
        modifier
            .fillMaxWidth()
            .background(Color.White)
    ) {
        Row(
            Modifier
                .fillMaxWidth()
                .padding(16.dp),
            horizontalArrangement = Arrangement.spacedBy(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            AsyncImage(
                model = dressData.brandUrl,
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(40.dp, 60.dp)
                    .background(Color.Black.copy(alpha = 0.1f))
            )
            Column(
                Modifier.weight(1.0f)
            ) {
                Text(text = dressData.brandName, fontWeight = FontWeight.Normal)
                Text(text = dressData.brandLocation, fontWeight = FontWeight.Normal)
            }
            OutlinedButton(onClick = onInfoClicked, Modifier) {
                Text(text = "Info", fontWeight = FontWeight.Light, fontSize = 12.sp)
            }
        }
        Box(modifier = Modifier
            .fillMaxWidth()
            .height(1.dp)
            .background(PrimaryColor))
        Row (
            Modifier
                .fillMaxWidth()
                .padding(16.dp),
            horizontalArrangement = Arrangement.spacedBy(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(text = dressData.description,
                Modifier
                    .weight(1.0f)
                    .padding(end = 120.dp))
            Row(
                Modifier,
                verticalAlignment = Alignment.Bottom,
                horizontalArrangement = Arrangement.spacedBy(4.dp)
            ) {
                Text(text = dressData.price, fontWeight = FontWeight.Black, fontSize = 16.sp)
                Text(text = "mxn", fontWeight = FontWeight.Light, fontSize = 14.sp)
            }
        }
        Button(onClick = onRentClicked,
            Modifier
                .fillMaxWidth()
                .padding(16.dp)) {
            Text(text = "Rent Dress", fontWeight = FontWeight.Light)
        }
    }
}

@Composable
fun Header(dressData: DressData, modifier: Modifier) {
    Box(
        modifier,
        contentAlignment = Alignment.BottomStart
    ) {
        AsyncImage(
            model = dressData.headerUrl,
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxSize()
                .background(PrimaryColor.copy(alpha = 0.5f))
        )

        Column(
            Modifier.padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            AsyncImage(
                model = dressData.primaryUrl,
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(120.dp)
                    .background(PrimaryColor.copy(alpha = 0.5f), RoundedCornerShape(16.dp))
                    .clip(RoundedCornerShape(16.dp))
            )
            AsyncImage(
                model = dressData.secondaryUrl,
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(120.dp)
                    .background(PrimaryColor.copy(alpha = 0.5f), RoundedCornerShape(16.dp))
                    .clip(RoundedCornerShape(16.dp))
            )
        }
    }
}

@Preview
@Composable
fun Preview_DressScreen() {
    DressDetailScreen(PreviewData.dresses.first(), {}, {})
}

@Preview
@Composable
fun Preview_Container() {
    Container(PreviewData.dresses.first(), Modifier, {}, {})
}



data class DressData(
    val headerUrl: String,
    val primaryUrl: String,
    val secondaryUrl: String,
    val brandUrl: String,
    val brandName: String,
    val brandLocation: String,
    val description: String,
    val price: String
)
