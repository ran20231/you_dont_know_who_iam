package com.forsale.app.utils.facades.user;

import falcon.chat.Chat;
import falcon.chat.entities.UserEntity;
import falcon.chat.utils.PushUtils;
import falcon.chat.utils.a;
import g00.l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.o;
import wz.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatInteractor.kt */
/* loaded from: classes3.dex */
public final class ChatInteractor$loginToChat$2$2 extends Lambda implements l<UserEntity, p> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ com.forsale.app.datalayer.database.UserEntity f40206a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ String f40207b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatInteractor$loginToChat$2$2(com.forsale.app.datalayer.database.UserEntity userEntity, String str) {
        super(1);
        this.f40206a = userEntity;
        this.f40207b = str;
    }

    public final void b(UserEntity it2) {
        o.i(it2, "it");
        a.f56033a.g(true);
        Chat.Companion companion = Chat.f55705a;
        String firstName = this.f40206a.getFirstName();
        String str = "";
        if (firstName == null) {
            firstName = "";
        }
        String image = this.f40206a.getImage();
        if (image != null) {
            str = image;
        }
        companion.x(firstName, str);
        PushUtils.f56008a.k(this.f40207b);
    }

    @Override // g00.l
    public /* bridge */ /* synthetic */ p invoke(UserEntity userEntity) {
        b(userEntity);
        return p.f75480a;
    }
}
