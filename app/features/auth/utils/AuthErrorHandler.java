package com.forsale.app.features.auth.utils;

import bj.a;
import bj.c;
import com.forsale.app.datalayer.network.entities.errors.AuthErrorModel;
import com.forsale.app.datalayer.network.errorhandling.ErrorCodes;
import com.forsale.app.features.auth.utils.AuthServerErrorsState;
import g00.l;
import java.util.Map;
import kotlin.collections.j0;
import kotlin.jvm.internal.o;
import retrofit2.HttpException;
import wz.p;
/* compiled from: AuthErrorHandler.kt */
/* loaded from: classes2.dex */
public final class AuthErrorHandler {
    public final a a(final l<? super c, p> onError) {
        o.i(onError, "onError");
        return new a.C0179a().b(new int[]{ErrorCodes.VALIDATION_ERROR_CODE}, new l<HttpException, c>() { // from class: com.forsale.app.features.auth.utils.AuthErrorHandler$consumeError$1
            @Override // g00.l
            /* renamed from: b */
            public final c invoke(HttpException it2) {
                o.i(it2, "it");
                AuthErrorModel parseErrorModel = AuthErrorModel.Companion.parseErrorModel(it2);
                Map<String, String> errors = parseErrorModel.getErrors();
                if (errors == null) {
                    errors = j0.h();
                }
                return new AuthServerErrorsState.ValidationError(errors, parseErrorModel.getMessage());
            }
        }).b(new int[]{ErrorCodes.BLOCKED_USER_ERROR_CODE}, new l<HttpException, c>() { // from class: com.forsale.app.features.auth.utils.AuthErrorHandler$consumeError$2
            @Override // g00.l
            /* renamed from: b */
            public final c invoke(HttpException it2) {
                o.i(it2, "it");
                String message = AuthErrorModel.Companion.parseErrorModel(it2).getMessage();
                if (message == null) {
                    message = "";
                }
                return new AuthServerErrorsState.b(message);
            }
        }).b(new int[]{ErrorCodes.UNAUTHORIZED_ERROR_CODE}, new l<HttpException, c>() { // from class: com.forsale.app.features.auth.utils.AuthErrorHandler$consumeError$3
            @Override // g00.l
            /* renamed from: b */
            public final c invoke(HttpException it2) {
                o.i(it2, "it");
                String message = AuthErrorModel.Companion.parseErrorModel(it2).getMessage();
                if (message == null) {
                    message = "";
                }
                return new AuthServerErrorsState.c(message);
            }
        }).c(new l<c, p>() { // from class: com.forsale.app.features.auth.utils.AuthErrorHandler$consumeError$4
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            public final void b(c it2) {
                o.i(it2, "it");
                onError.invoke(it2);
            }

            @Override // g00.l
            public /* bridge */ /* synthetic */ p invoke(c cVar) {
                b(cVar);
                return p.f75480a;
            }
        }).a();
    }
}
