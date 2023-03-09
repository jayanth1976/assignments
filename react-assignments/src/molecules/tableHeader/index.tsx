import React from "react";
import { makeStyles } from "@mui/styles";
import { Typography } from "@mui/material";
import theme from "../../theme";
import SearchSvg from "../../images/SearchSvg";
import { TextField } from "../../atoms/TextField";
import FilterSvg from "../../images/FilterSvg";
import TextWithIcon from "../../atoms/TextWithIcon";
import MenuSvg from "../../images/MenuSvg";

interface TableHeaderProps {
    handleClick: () => any;
}

const useStyles = makeStyles({
    center: {
        display: "flex",
        justifyContent: "center",
        alignItems: "center",
    },
    mainCon: {
        height: "9%",
        width: "100%",
    },
    grid: {
        display: "grid",
        height: "61.95%",
        width: "100%",
        gridTemplateColumns: "0.9fr 1.1fr",
    },
    title: {
        paddingLeft: "3.79% !important",
        alignItems: "center",
        margin: "0 !important",
    },
    right: {
        justifyContent: "space-around",
    },
    input: {
        height: "100%",
        width: "344px",
        padding: "0.25em 2.5em",
        border: `1px solid ${theme.palette.grey[50]}`,
        borderRadius: "0.25em",
        "&:focus": {
            outline: "1px solid hsla(201,100%,50%,0.5)",
        },
        fontSize: "14px",
    },
    inputContainer: {
        display: "inline-block",
        height: "100%",
        position: "relative",
    },
    searchIcon: {
        position: "absolute",
        left: "2%",
        top: "20%",
    },
    classMainCon: {
        height: "100%",
        width: "90px",
        display: "flex",
        justifyContent: "center",
        alignItems: "center",
        border: `1px solid ${theme.palette.grey[50]}`,
        borderRadius: "2px",
        cursor: "pointer",
    },
    classIcon: {
        display: "inline-block",
        background: "aqua",
    },
    classText: {
        marginTop: "0 !important",
        paddingLeft: "6.5px",
    },
    classMenu: {
        border: `1px solid ${theme.palette.grey[50]}`,
        height: "100%",
        width: "36px",
    },
});

const TableHeader = ({ handleClick }: TableHeaderProps) => {
    const classes = useStyles();
    return (
        <div className={`${classes.mainCon} ${classes.center}`}>
            <div className={classes.grid}>
                <Typography variant="subtitle1" className={classes.title}>
                    Candidate information
                </Typography>
                <div className={`${classes.right} ${classes.center}`}>
                    <div className={classes.inputContainer}>
                        <TextField
                            className={classes.input}
                            type="text"
                            placeholder="Search any candidate"
                        />
                        <SearchSvg css={classes.searchIcon} />
                    </div>
                    <TextWithIcon
                        text="Filter"
                        Icon={FilterSvg}
                        classIcon={classes.classIcon}
                        classMainCon={classes.classMainCon}
                        classText={classes.classText}
                        variant="subtitle2"
                        onClick={handleClick}
                    />
                    <MenuSvg
                        css={`
                            ${classes.classMenu} ${classes.center}
                        `}
                    />
                </div>
            </div>
        </div>
    );
};

export default TableHeader;
