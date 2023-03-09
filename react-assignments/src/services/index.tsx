import axios from "axios";
import React from "react";

interface jokeAPIProps {
    setLoading: React.Dispatch<React.SetStateAction<boolean>>;
    setJoke: React.Dispatch<React.SetStateAction<string>>;
}

export const jokeAPI = ({ setLoading, setJoke }: jokeAPIProps) => {
    axios
        .get("https://v2.jokeapi.dev/joke/Programming?type=single")
        .then(async (res) => {
            const jokeText = await res.data.joke;
            setJoke(jokeText ? jokeText : "error");
            setTimeout(() => {
                setLoading(false);
            }, 1000);
        })
        .catch((err) => setJoke(err.message));
};

interface DataProps {
    name: string;
    adjudication: string;
    status: string;
    location: string;
    date: string;
}

export const tableAPI = async (
    setDummyData: React.Dispatch<React.SetStateAction<DataProps[]>>
) => {
    try {
        const data = await axios.get(
            "http://3.142.174.99:8080/candidateDetails"
        );
        setDummyData(data.data);
    } catch (error: any) {
        console.log(error.message);
    }
};

const axiosInstance = axios.create({
    baseURL: "http://3.142.174.99:8080",
});

export const getData = () => {
    return axiosInstance.get("/candidate-information");
};

export const getDataById = (id: any) => {
    return axiosInstance.get(`/candidate-information/${id}`);
};
