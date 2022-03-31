//package Atividades;
//
//import java.util.HashMap;
//import java.util.Map;
//import java.util.Objects;
//
//public class CollectionsOrdenacaoMap {
//    @Override
//    public String toString() {
//        return "CollectionsOrdenacaoMap{}";
//    }
//
//    public static void main(String[] args) {
//
//        Map<String, Livro> muesLivros = new HashMap<>(){{
//            put("Deus", new Livro("Biblia Sagrada", 1000));
//
//
//        }};
//        class Livro {
//            private String nome;
//            private Integer paginas;
//
//            public Livro(String nome, String autor, Integer paginas){
//                this.nome = nome;
//                this.paginas = paginas;
//            }
//
//
//            public String getNome() {
//                return nome;
//            }
//
//            public Integer getPaginas() {
//                return paginas;
//            }
//
//            @Override
//            public boolean equals(Object o) {
//                if (this == o) return true;
//                if (o == null || getClass() != o.getClass()) return false;
//                Livro livro = (Livro) o;
//                return nome.equals(livro.nome) && paginas.equals(livro.paginas);
//            }
//
//            @Override
//            public int hashCode() {
//                return Objects.hash(nome, paginas);
//            }
//        }
//    }
//}
