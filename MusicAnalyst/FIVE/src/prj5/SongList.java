package prj5;

// -------------------------------------------------------------------------
/**
 * Write a one-sentence summary of your class here. Follow it with additional
 * details about its purpose, what abstraction it represents, and how to use it.
 * 
 * @param <Song>
 * @author lil bo peep
 * @version Apr 22, 2018
 */
public class SongList
    extends DLList<Song>
{

    // ~ Fields ................................................................
    public SongList songs;


    // public DLList<Song> songs;
    @SuppressWarnings("javadoc")
    public SongList()
    {

    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("[");
        if (!isEmpty() && this != null) {

            for (int i = 1; i < this.size(); i++) 
            {
                builder.append(this.getEntry(i).getTitle());
                
            }
        }

        builder.append("]");
        return builder.toString();
    }

    // ----------------------------------------------------------
    /**
     * Place a description of your method here.
     * 
     * @param songs
     * @return
     */
    public void sortByGenre()
    {
        if (this.isEmpty())
        {
            return;
        }

        // So we are changing the loop to start at index 1
        // so that we can always grab the current and previous elements, since
        // element 0 will always be sorted
        for (int i = 1; i < songs.size(); i++)
        {
            // We want to grab the previous and current elements because those
            // will be what we are comparing
            Song prev = this.getEntry(i - 1);
            Song curr = this.getEntry(i);

            // Checking for null just because it's good practice
            if (prev == null || curr == null)
            {
                break;
            }

            // Now that we have the two songs we want to compare, we will grab
            // each ones Genre, or Title, or Artist depending on the function
            // These next two lines are the only two lines that will need to be
            // changed when redoing the sort for a different string
            String prevGenre = prev.getGenre();
            String currGenre = curr.getGenre();

            // Now we check to see if they are already sorted, if they are the
            // same just leave them
            if (currGenre.compareTo(prevGenre) >= 0)
            {
                // Continue to check the next two elements
                continue;
            }
            else if ( currGenre.compareTo(prevGenre) <= 0)
            {
                // Here is where we need to do a swap of the two elements
                // I'm assuming you have some type of setEntry() function that
                // can place a song into the list at a specific element
                // if not I can come up with another way to do the swap
                this.replace(i, prev);
                this.replace(i - 1,curr);

                // If you don't like the recursion method you can do the same
                // tyoe of thing with nested for loops
                // And I think this way will actually have a better efficiency
                // because this is more of a true insertion sort
                for (int k = i - 2; k >= 0; k--)
                {
                    // We want to grab the song before the previous one since we
                    // need to check if we need to keep swapping
                    Song nextSong = this.getEntry(k);

                    // Checking for null just because it's good practice
                    if (nextSong == null)
                    {
                        break;
                    }

                    String nextSongGenre = nextSong.getGenre();

                    // Now we check to see if they are already sorted, if they
                    // are the same just leave them
                    if (currGenre.compareTo(nextSongGenre) >= 0)
                    {
                        // Everything prior to the current node is sorted, so
                        // break out of the internal for loop to continue the
                        // outter most for loop
                        break;
                    }
                    else   if (currGenre.compareTo(nextSongGenre) <= 0)
                           // 0
                    {
                        // So this may be a little confusing, so k is the
                        // location of the node prior to prev
                        // So if we need to swap curr node and the node at k, we
                        // need to set the kth node to curr
                        // and the k+1 node to the node we are swapping with.
                        this.replace(k + 1, nextSong );
                        this.replace(k, curr);
                        // allow the inner loop to continue and check the next
                        // value
                    } // Inner else
                } // Inner for loop
            } // Outer else
        } // Outer for loop

        return;
    }


    public SongList sortByArtist(SongList songs)
    {
        if (songs.isEmpty())
        {
            return null;
        }
        Song stbs = songs.getEntry(0);

        Song first = songs.get(0);
        for (int i = 0; i < songs.size(); i++)
        {
            String firstArtist = first.getArtist();
            String artist = stbs.getArtist();

            if (artist.compareTo(firstArtist) < 0)
            {
                stbs = first;
                songs.replace(0, first);

            }
            else if (artist.compareTo(firstArtist) > 0)
            {
                continue;
                // i doubt this will actually work lol but ok.

            }

        }
        return songs;
    }
}
