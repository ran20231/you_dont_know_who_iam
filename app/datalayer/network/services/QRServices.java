package com.forsale.app.datalayer.network.services;

import com.forsale.app.datalayer.network.entities.qrsessions.ForSaleWebSession;
import com.forsale.app.datalayer.network.requestsbodies.GetAllQRSessionsBody;
import com.forsale.app.datalayer.network.requestsbodies.LogoutAllSessionsAsyncBody;
import com.forsale.app.datalayer.network.requestsbodies.VerifyQRCodeBody;
import com.forsale.app.datalayer.network.responses.VerifyQRCodeResponse;
import i10.a;
import i10.o;
import java.util.List;
/* compiled from: QRServices.kt */
/* loaded from: classes2.dex */
public interface QRServices {
    @o("Qr/GettAllSessions")
    Object getAllSessionsAsync(@a GetAllQRSessionsBody getAllQRSessionsBody, zz.a<? super List<ForSaleWebSession>> aVar);

    @o("Qr/LogoutAllSessions")
    Object logoutAllSessionsAsync(@a LogoutAllSessionsAsyncBody logoutAllSessionsAsyncBody, zz.a<? super Boolean> aVar);

    @o("Qr/VerifyQrcode")
    Object verifyQRCodeAsync(@a VerifyQRCodeBody verifyQRCodeBody, zz.a<? super VerifyQRCodeResponse> aVar);
}
