Getting Started with Gauge
==========================

This is an executable specification file. This file follows markdown syntax. Every heading in this file denotes a scenario. Every bulleted point denotes a step.
To execute this specification, use `mvn test`

Urune Gelen Degerlendirmeyi Begenme
------------------------------------
* Kullanıcı "https://www.hepsiburada.com/" sitesini ziyaret eder
* Kullanıcı "iphone" anahtar kelimesini arama kısmına yazar.
* Aranan ürünün geldiği görülür.
* Listelenen ürünler arasından rastgele ürün seçilir.
* Kullanıcı, seçilen ürün için ürün detayda "Değerlendirmeler" tabına gider.
* Kullanıcı gelen değerlendirmeler içerisinde ilk değerlendirmenin "Evet" butonuna basar.
* Kullanıcı "Teşekkür Ederiz." yazısının geldiğini görür.


Urune Gelen Degerlendirme Siralama Alanini Kontrol Etme
----------------------------------------------------------
* Kullanıcı "https://www.hepsiburada.com/" sitesini ziyaret eder
* Kullanıcı "iphone" anahtar kelimesini arama kısmına yazar.
* Aranan ürünün geldiği görülür.
* Listelenen ürünler arasından rastgele ürün seçilir.
* Kullanıcı, seçilen ürün için ürün detayda "Değerlendirmeler" tabına gider.
* Sırala dropbox'ına tıklanır
* Sırala dropbox'ı doğru şekilde kontrol edilir.
