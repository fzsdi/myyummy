package ir.ifaeze.myyummy;

public class DirectionsFragment extends CheckBoxesFragment {
    @Override
    public String[] getContents(int index) {
        return Recipes.directions[index].split(",");
    }
}
