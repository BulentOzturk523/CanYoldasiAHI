import * as functions from "firebase-functions";
import * as admin from "firebase-admin";

admin.initializeApp();

export const merhabaDunya = functions.region("europe-west1").https.onRequest((request, response ) => {
  response.send("Merhaba, ben Can Yoldaşı AHI. Beynim çalışıyor.");
});

export const yeniKullaniciKaydi = functions.region("europe-west1").auth.user().onCreate(async (user) => {
  const userProfile = {
    email: user.email || "",
    adSoyad: user.displayName || "Yeni Kullanıcı",
    kayitTarihi: admin.firestore.FieldValue.serverTimestamp(),
    abonelikTuru: "ücretsiz",
    tercihEdilenDil: "tr",
  };
  try {
    await admin.firestore().collection("users").doc(user.uid).set(userProfile);
    return null;
  } catch (error) {
    console.error("Kullanıcı profili yazma hatası:", error);
    return null;
  }
});