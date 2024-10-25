package com.forsale.app.utils.facades.user;

import falcon.chat.entities.UserEntity;
import g00.l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.o;
import wz.p;
/* compiled from: ChatInteractor.kt */
/* loaded from: classes3.dex */
final class ChatInteractor$logoutFromChat$2 extends Lambda implements l<UserEntity, p> {

    /* renamed from: a  reason: collision with root package name */
    public static final ChatInteractor$logoutFromChat$2 f40209a = new ChatInteractor$logoutFromChat$2();

    ChatInteractor$logoutFromChat$2() {
        super(1);
    }

    public final void b(UserEntity it2) {
        o.i(it2, "it");
    }

    @Override // g00.l
    public /* bridge */ /* synthetic */ p invoke(UserEntity userEntity) {
        b(userEntity);
        return p.f75480a;
    }
}
