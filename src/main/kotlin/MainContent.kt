import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.css.cssRem
import org.jetbrains.compose.web.css.fontSize
import org.jetbrains.compose.web.css.fontWeight
import org.jetbrains.compose.web.css.gridColumn
import org.jetbrains.compose.web.css.gridRow
import org.jetbrains.compose.web.dom.Br
import org.jetbrains.compose.web.dom.P
import org.jetbrains.compose.web.dom.Text

@Composable
fun MainContent() {
    P(attrs = {
        style {
            gridColumn(start = 2, end = 3)
            gridRow(start = 2, end = 3)
            fontSize(6.cssRem)
            fontWeight(value = 600)
        }
    }) {
        Text("Hi,")
        Br()
        Text("I'm Edwin")
    }
    P(attrs = {
        style {
            gridColumn(start = 3, end = 4)
            gridRow(start = 2, end = 3)
        }
    }) {
        Text("picture")
    }
    P(attrs = {
        style {
            gridColumn(start = 2, end = 4)
            gridRow(start = 3, end = 4)
            fontSize(1.6.cssRem)
        }
    }) {
        Text("I'm a software developer interested in the latest tech out there.")
    }
}
