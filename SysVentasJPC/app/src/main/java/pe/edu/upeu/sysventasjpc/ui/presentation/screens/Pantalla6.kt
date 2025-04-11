package pe.edu.upeu.sysventasjpc.ui.presentation.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import pe.edu.upeu.sysventasjpc.ui.presentation.components.CheckboxParentExample // Asegúrate de que la ruta sea correcta

@SuppressLint("UnusedBoxWithConstraintsScope")
@Composable
fun Pantalla6() {
    BoxWithConstraints(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background),
        contentAlignment = Alignment.Center
    ) {
        CheckboxParentExample()
    }
}
