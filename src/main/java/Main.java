public class Main {
    @RequestMapping(value="/acheter", method=RequestMethod.POST)
    public ModelAndView acheterArticle() {
        // votre logique d'achat ici
        return new ModelAndView("confirmation");
    }
}
