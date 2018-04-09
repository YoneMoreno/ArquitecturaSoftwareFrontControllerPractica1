let triggers = document.querySelectorAll('a');
//console.log(triggers);
const highlight = document.createElement('span');
highlight.classList.add('highlight');
document.body.appendChild(highlight);

function highlightLink() {
    const linkCoords = this.getBoundingClientRect();
    //console.log(linkCoords);
    const coords = {
        width: linkCoords.width,
        height: linkCoords.height,
        top: linkCoords.top + window.scrollY,
        left: linkCoords.left + window.scrollX
    };
    console.log(coords.width);

    highlight.style.width = coords.width + 'px';
    console.log(highlight.style.width);
    highlight.style.height = coords.height + 'px';
    highlight.style.transform = 'translate(' + coords.left + 'px,' + coords.top + 'px)';

}

triggers.forEach(a => a.addEventListener('mouseenter', highlightLink));
