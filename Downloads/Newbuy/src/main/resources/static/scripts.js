// CART
let cartCount = 0;
const cartDisplay = document.getElementById("cart-count");

document.querySelectorAll(".add-btn").forEach(btn=>{
    btn.addEventListener("click", ()=>{
        cartCount++;
        cartDisplay.textContent = cartCount;
    });
});

// SCROLL REVEAL
function reveal(){
    let reveals = document.querySelectorAll(".reveal");
    for(let i=0;i<reveals.length;i++){
        let windowHeight = window.innerHeight;
        let elementTop = reveals[i].getBoundingClientRect().top;
        let elementVisible = 100;
        if(elementTop < windowHeight - elementVisible){
            reveals[i].classList.add("active");
        }
    }
}
window.addEventListener("scroll", reveal);

// BACK TO TOP
const topBtn = document.getElementById("topBtn");

window.onscroll = function(){
    if(document.body.scrollTop > 300 || document.documentElement.scrollTop > 300){
        topBtn.style.display = "block";
    } else {
        topBtn.style.display = "none";
    }
};

topBtn.onclick = function(){
    window.scrollTo({top:0,behavior:"smooth"});
};
// Navbar shadow on scroll
window.addEventListener("scroll", function(){
  const navbar = document.getElementById("navbar");
  if(window.scrollY > 50){
    navbar.classList.add("scrolled");
  } else {
    navbar.classList.remove("scrolled");
  }
});
document.addEventListener("DOMContentLoaded", function () {

  /* IMAGE SWITCHING */
  const mainImage = document.getElementById("mainImage");
  const thumbnails = document.querySelectorAll(".thumb");

  thumbnails.forEach(thumb => {
    thumb.addEventListener("click", function () {
      mainImage.src = this.src;

      thumbnails.forEach(t => t.classList.remove("active"));
      this.classList.add("active");
    });
  });

  /* QUANTITY */
  const plus = document.getElementById("plus");
  const minus = document.getElementById("minus");
  const quantity = document.getElementById("quantity");

  plus.addEventListener("click", function () {
    quantity.value = parseInt(quantity.value) + 1;
  });

  minus.addEventListener("click", function () {
    if (parseInt(quantity.value) > 1) {
      quantity.value = parseInt(quantity.value) - 1;
    }
  });

});