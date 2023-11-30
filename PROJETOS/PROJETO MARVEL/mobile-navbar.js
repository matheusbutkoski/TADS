const botao1 = document.querySelector(".seta-baixo")

  botao1.addEventListener("click", () => {
      window.scroll({top: window.innerHeight, behavior: "smooth"})
  })

  const botao2 = document.querySelector(".seta-cima")

  botao2.addEventListener("click", () => {
      window.scroll({top: "100%", behavior: "smooth"})
  })

class MobileNavbar {
    constructor(mobileMenu, navList, navLinks) {
      this.mobileMenu = document.querySelector(mobileMenu);
      this.navList = document.querySelector(navList);
      this.navLinks = document.querySelectorAll(navLinks);
      this.activeClass = "active";
  
      this.handleClick = this.handleClick.bind(this);
    }
  
    handleClick() {
      this.navList.classList.toggle(this.activeClass);
      this.mobileMenu.classList.toggle(this.activeClass);
      this.animateLinks();
    }
  
    addClickEvent() {
      this.mobileMenu.addEventListener("click", this.handleClick);
    }
  
    init() {
      if (this.mobileMenu) {
        this.addClickEvent();
      }
      return this;
    }
  }
  
  const mobileNavbar = new MobileNavbar(
    ".menu-mobile",
    ".cabecalho-menu",
    ".cabecalho-menu a",
  );
  mobileNavbar.init();

  