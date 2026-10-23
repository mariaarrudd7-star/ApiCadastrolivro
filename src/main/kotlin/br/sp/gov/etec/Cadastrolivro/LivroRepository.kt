
package br.sp.gov.etec.Cadastrolivro


import org.springframework.data.jpa.repository.JpaRepository

interface LivroRepository : JpaRepository<Livro, Long>

