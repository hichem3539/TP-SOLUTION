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
 /**
     * calculer la sommes des 2 vecteurs apres parcourir les deux en meme
     * temps et remplir un autre .
     * exeple d"utilisation :
     * si tab1={5,2,5} et tab2={2,1,5}
     * alors on aure comme resultat {7,3,10}
     * @param tab1 vedcteur des entiers numero 1
     * @param tab2 vecdteur des entiers numero 2
     * @return une autre vecteur qui contient la somme des deux vecteur
     * @throws Exception  si les desu vecteurs sont de tailles differentes
     */
     public int[] somme(int[] tab1 , int[] tab2 ) throws Exception
     {    int[] tab3=null;
         if ( tab1.length != tab2.length )
             throw new Exception("erreur");
          else
         {    tab3= new int[tab1.length];
             for( int i=0; i<=tab1.length-1 ; i++ )
                 tab3[i]=tab1[i]+tab2[i];
         }

        return tab3 ;
     }    
 /**
     * inverser l"ordre des entier qui se trouvent
     * dans le vecteur
     * exemple d'utilisation:
     * si tab={5,4,10,6}
     * apre inverser on aura tab={6,10,4,5}
     * @param tab un vecteur qui contient des entiers
     */
     public void inverser( int[] tab )
     {   int x;
         int l=(tab.length)/2;
         for (int i=0 ; i<=l ; i++ )
         {
             x=tab[i];tab[i]=tab[tab.length-i-1];tab[tab.length-i-1]=x;
         }
     }

}