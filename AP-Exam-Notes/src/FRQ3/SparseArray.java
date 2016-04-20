package FRQ3;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mip on 4/20/16.
 */
public class SparseArray
{
    /** The number of rows and columns in the sparse array. */
    private int numRows;
    private int numCols;
    /** The list of entries representing the non-zero elements of the sparse array. Entries are stored in the
     * list in no particular order. Each non-zero element is represented by exactly one entry in the list.
     */
    private List<SparseArrayEntry> entries;
    /** Constructs an empty SparseArray. */
    public SparseArray()
    { entries = new ArrayList<SparseArrayEntry>(); }
    /** Returns the number of rows in the sparse array. */
    public int getNumRows()
    { return numRows; }
    /** Returns the number of columns in the sparse array. */
    public int getNumCols()
    { return numCols; }
    /** Returns the value of the element at row index row and column index col in the sparse array.
     * Precondition: 0  row < getNumRows()
     * 0  col < getNumCols()
     */
    public int getValueAt(int row, int col)
    {

        for(int x = 0; x < entries.size(); x++)
        {
            // Grab one Element
            SparseArrayEntry temp = entries.get(x);

            // This object has getters for row, col, and val.

            if((temp.getRow() == row) && (temp.getCol() == col))
            {

                return temp.getValue();

            }
        }

        // Didn't find it,
        return 0;

    }
    /** Removes the column col from the sparse array.
     * Precondition: 0  col < getNumCols()
     */
    public void removeColumn(int col)
    {

        for(int x = 0; x < entries.size(); x++)
        {

            SparseArrayEntry temp = entries.get(x);

            // If the column for the temp entries
            // is equal to col...
            if(temp.getCol() == col)
            {

                // Take out the entries list.
                entries.remove(x);

                x--;
            }

            // Update the values of the columns that are greater than col.

            for(int y = 0; y < entries.size(); y++)
            {


                if(entries.get(y).getCol() > col)
                {
                    SparseArrayEntry temp2 = entries.get(y);
                    // Found an entry that we need to shift.
                    // Update the col value;
                    // How on earth if there's no setter??

                    SparseArrayEntry dupe = new SparseArrayEntry(temp2.getRow(), temp2.getRow() - 1, temp2.getValue());

                    entries.set(y, dupe);
                }


            }

        }
    }
    // There may be instance variables, constructors, and methods that are not shown.
}
