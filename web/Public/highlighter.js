/*Here we have the javascript to get the position of the link where the user is
 * entering the mouse, then we calculate the rectangle which fits that link, to be able
 * to get its width and height. Finally we move the span to the position where the user
 * entered the mouse if it is on a link
 * */


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
