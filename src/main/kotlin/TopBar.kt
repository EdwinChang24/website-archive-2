import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.css.AlignItems
import org.jetbrains.compose.web.css.DisplayStyle
import org.jetbrains.compose.web.css.FlexDirection
import org.jetbrains.compose.web.css.JustifyContent
import org.jetbrains.compose.web.css.alignItems
import org.jetbrains.compose.web.css.cssRem
import org.jetbrains.compose.web.css.display
import org.jetbrains.compose.web.css.em
import org.jetbrains.compose.web.css.flexDirection
import org.jetbrains.compose.web.css.fontSize
import org.jetbrains.compose.web.css.gridColumn
import org.jetbrains.compose.web.css.gridRow
import org.jetbrains.compose.web.css.height
import org.jetbrains.compose.web.css.justifyContent
import org.jetbrains.compose.web.css.padding
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.dom.A
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.Img
import org.jetbrains.compose.web.dom.Span
import org.jetbrains.compose.web.dom.Text

@Composable
fun TopBar() = Div(attrs = {
    style {
        gridColumn(start = 1, end = 5)
        gridRow(start = 1, end = 2)
        display(DisplayStyle.Flex)
        flexDirection(FlexDirection.Row)
        justifyContent(JustifyContent.SpaceBetween)
        alignItems(AlignItems.Center)
        padding(1.em)
    }
}) {
    Span(attrs = {
        style {
            fontSize(1.4.cssRem)
        }
    }) {
        Text("Edwin Chang")
    }
    A(href = "https://github.com/EdwinChang24/", attrs = {
        style {
            height(2.em)
        }
    }) {
        Img(src = "/github-mark.svg", alt = "GitHub logo", attrs = {
            style {
                height(100.percent)
            }
        })
    }
}
