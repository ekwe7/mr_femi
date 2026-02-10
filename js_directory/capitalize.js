const capitalize = (str) => {
    if (str === null || str.length === 0) {
        return str;
    }

    const words = str.split(" ");
    let text = "";

    for (let word of words) {
        if (word.length > 0) {
            text += word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase() + " ";
        }
    }

    return text.trim();
};

const words = ["this is a tree"];

console.log(capitalize(words[0]));
