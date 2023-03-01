import { createTheme } from "@mui/material/styles";

const theme = createTheme({
    palette: {
        primary: {
            main: "#224DFF",
        },
        grey: {
            50: "#E5E7ED",
            100: "#696A6E",
            200: "#818287",
            300: "#F7F8FA",
        },
    },
    typography: {
        fontFamily: "Inter",
        h3: {
            fontWeight: "500",
            fontSize: "20px",
            lineHeight: "30px",
        },
        subtitle1: {
            fontSize: "16px",
            fontWeight: "500",
            marginTop: "8px",
            color: "#2C2C2E",
        },
        subtitle2: {
            fontSize: "14px",
            color: "#696A6E",
            fontWeight: "400",
            marginTop: "8px",
        },
    },
});

export default theme;
