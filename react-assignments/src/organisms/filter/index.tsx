import React from "react";
// import {Checkbox} from "../atoms/Checkbox/Checkbox";
import Adjudication from "../../molecules/adjudication";
import Status from "../../molecules/status";
import styled from "styled-components";
import theme from "../../theme";

interface FilterProps {
    classFilter?: string;
    updateStatusArr?: any;
}

const Wrapper = styled.div`
    width: 285px;
    height: 352px;
    box-shadow: 0 5px 20px rgba(0, 0, 0, 0.4);
    border-radius: 6px;
    font-size: 14px;
    font-family: "Inter";
    position: absolute;
    background: white;

    & .filterPara {
        padding: 0.75rem 1rem;
        font-weight: 500;
        border-bottom: 1px solid ${theme.palette.grey[50]};
    }

    & .statusPara {
        padding: 0.75rem 1rem;
        font-weight: 500;
        color: ${theme.palette.grey[200]};
        padding-bottom: 12px;
    }
`;

const Filter = ({ classFilter, updateStatusArr }: FilterProps) => {
    return (
        <Wrapper className={`filterStyles ${classFilter}`}>
            <p className="filterPara">Filters</p>
            <p className="statusPara">Status</p>
            <Status handleUpdate={updateStatusArr} />
            <p className="statusPara">Adjudication</p>
            <Adjudication />
        </Wrapper>
    );
};

export default Filter;
