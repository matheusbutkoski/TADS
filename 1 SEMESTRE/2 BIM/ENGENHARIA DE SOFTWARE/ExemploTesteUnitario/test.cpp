#include "pch.h"
#include "codigoTeste.h"

TEST(NumerosPositivosNegativos, Teste_elevarAoQuadrado) {
  EXPECT_EQ(4, elevarAoQuadrado(2));
  EXPECT_EQ(25, elevarAoQuadrado(5));
  EXPECT_EQ(9, elevarAoQuadrado(-3));
}

TEST(CasoDeTesteDivisao, TestarDivisaoNumerosInteiros) {
	EXPECT_EQ(2, divisaoDoisNumerosInteiros(4, 2));
	EXPECT_EQ(-2, divisaoDoisNumerosInteiros(-10, 5));

	EXPECT_HRESULT_FAILED( divisaoDoisNumerosInteiros(10, 0));
}

TEST(CasoDeTesteNumeroPrimo, TestarNumerosPrimos) {
	EXPECT_FALSE(VerificarNumeroPrimo(10));
	EXPECT_FALSE(VerificarNumeroPrimo(16));
	EXPECT_TRUE(VerificarNumeroPrimo(7));
	EXPECT_TRUE(VerificarNumeroPrimo(5));
	EXPECT_TRUE(VerificarNumeroPrimo(2));
	EXPECT_TRUE(VerificarNumeroPrimo(11));

}