let textDiv = document.querySelector(".type");
let content = textDiv.innerHTML;
console.log(content);

let len = content.length;

i = 0;
setInterval(() => {
    textDiv.innerHTML = content.substring(0, i++);
    if (i === len + 2) {
        clearInterval(intervalId);
    }
}, 100);

const view = document.querySelectorAll(".fa-eye");
console.log("hi");
view.forEach((item) => {
    item.addEventListener("click", () => {
        window.location("https://bugreportingsys.000webhostapp.com/index.html");
    });
});
