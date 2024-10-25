package com.forsale.app.features.more.user.editprofile.changepassword;

import com.forsale.app.datalayer.network.requestsbodies.ChangePasswordBody;
import com.forsale.app.datalayer.network.responses.RequestCompleted;
import com.forsale.app.datalayer.network.services.AuthService;
import kotlin.jvm.internal.o;
/* compiled from: ChangePasswordInteractor.kt */
/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private final AuthService f33217a;

    public b(AuthService userService) {
        o.i(userService, "userService");
        this.f33217a = userService;
    }

    public final Object a(ChangePasswordBody changePasswordBody, zz.a<? super RequestCompleted> aVar) {
        return this.f33217a.changePassword(changePasswordBody, aVar);
    }
}
