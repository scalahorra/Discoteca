package DI2021.Discoteca;

import java.util.List;

import DI2021.Discoteca.models.Album;
import DI2021.Discoteca.services.AlbumRecoveryService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        List<Album> myAlbums = AlbumRecoveryService.getAllAlbums();
        for(var album: myAlbums) {
        	System.out.println(album);
        }
    }
}
