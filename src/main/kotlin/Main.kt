import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.css.DisplayStyle
import org.jetbrains.compose.web.css.Position
import org.jetbrains.compose.web.css.display
import org.jetbrains.compose.web.css.fontFamily
import org.jetbrains.compose.web.css.fontWeight
import org.jetbrains.compose.web.css.gridTemplateColumns
import org.jetbrains.compose.web.css.gridTemplateRows
import org.jetbrains.compose.web.css.height
import org.jetbrains.compose.web.css.left
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.position
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.css.top
import org.jetbrains.compose.web.css.width
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.renderComposableInBody

fun main() {
    renderComposableInBody {
        Body()
    }
}

@Composable
fun Body() = Div(attrs = {
    style {
        position(Position.Absolute)
        top(0.px)
        left(0.px)
        height(100.percent)
        width(100.percent)
        display(DisplayStyle.Grid)
        gridTemplateRows("auto 3fr 2fr auto")
        gridTemplateColumns("minmax(50px, auto) auto auto minmax(50px, auto)")
        fontFamily("Inter", "system-ui")
        fontWeight(value = 450)
    }
}) {
    TopBar()
    MainContent()
    BottomBar()
}
