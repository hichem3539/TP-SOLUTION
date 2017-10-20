/**
 * c'est une classe appelé VectorHelper qui assure quelque
 * operations sur les vecteurs
 * @version 1.0
 * @author HICHEM AND DJAMEL
 */
public class VectorHelper
{
    /**
     * les trier du plus petit au plus grand
     *exemple d"utilisation :
     * si tab={5,4,2,10}
     * apres trier tab={2,4,5,10}
     * @param tab:un vecteur qui contient des entiers
     */
     public void trier(int[] tab)
     {
         int l=tab.length,x;
         if (l>1)
         {
          for( int i=0; i<=l-2 ; i++ )
          {
              for ( int j=i+1 ; j<=l-1 ; j++ )
              {
                  if (tab[i]>tab[j])
                  {
                   x=tab[i];tab[i]=tab[j];tab[j]=x;
                  }
              }
          }
         }
     }
    


}