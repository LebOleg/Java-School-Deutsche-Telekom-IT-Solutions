function startTimer(duration, display) {
    let start = Date.now(),
        diff,
        minutes,
        seconds;

    function timer() {
        diff = duration - (((Date.now() - start) / 1000) | 0);

        minutes = (diff / 60) | 0;
        seconds = (diff % 60) | 0;

        minutes = minutes < 10 ? "0" + minutes : minutes;
        seconds = seconds < 10 ? "0" + seconds : seconds;

        display.textContent = minutes + ":" + seconds;

        if (diff <= 0) {
            start = Date.now() + 1000;
        }
    };

    timer();
    setInterval(timer, 1000);
}

window.onload = function () {
    let fm = 60 * 15,
        display = document.querySelector('#time');
    startTimer(fm, display);
};