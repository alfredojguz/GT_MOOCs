public interface Impostor {
    public void freeze(Player player); // no need to include abstract in variable definition bc interface is inherently abstract 
    public void sabotage(Player player);
    // define said methods in other classes that call imposter.
}
