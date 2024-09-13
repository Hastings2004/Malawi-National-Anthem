package com.hastings.nationalanthem

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.hastings.nationalanthem.ui.theme.NationalAnthemTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            NationalAnthemTheme {
                MalawiNationalFlag()
                }
            }
        }
    }
@Composable
fun AnthemText( modifier: Modifier = Modifier) {
    Column{
        Text(
            text = "O God bless our land of Malawi,\n" +
                    "Keep it a land of peace.\n" +
                    "Put down each and every enemy,\n" +
                    "Hunger, disease, envy.\n",
            modifier = modifier.padding(top = 20.dp, start = 45.dp, end = 40.dp, bottom = 10.dp),
            textAlign = TextAlign.Center
        )
        Text(
            text = "Join together all our hearts as one,\n" +
                    "That we be free from fear.\n" +
                    "Bless our leader, each and every one,\n" +
                    "And Mother Malawi.\n",
            modifier = Modifier.padding(top = 10.dp, start = 45.dp, end = 40.dp, bottom = 50.dp),
            textAlign = TextAlign.Center
        )
    }
}

@Composable
fun MalawiNationalFlag(modifier: Modifier = Modifier){
    val image = painterResource(R.drawable.istockphoto_1388085273_1024x1024)
    Column{
        Image(
        painter = image,
        contentDescription = null,
        modifier = Modifier.padding(30.dp),

    )
    AnthemText()
    }
}

@Preview(showBackground = true)
@Composable
fun NationalAnthemPreview() {
    NationalAnthemTheme {
        MalawiNationalFlag()
    }
}