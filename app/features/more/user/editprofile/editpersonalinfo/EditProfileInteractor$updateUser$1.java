package com.forsale.app.features.more.user.editprofile.editpersonalinfo;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: EditProfileInteractor.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.more.user.editprofile.editpersonalinfo.EditProfileInteractor", f = "EditProfileInteractor.kt", l = {18, 25}, m = "updateUser")
/* loaded from: classes2.dex */
public final class EditProfileInteractor$updateUser$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f33371a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Object f33372b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ EditProfileInteractor f33373c;

    /* renamed from: d  reason: collision with root package name */
    int f33374d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EditProfileInteractor$updateUser$1(EditProfileInteractor editProfileInteractor, zz.a<? super EditProfileInteractor$updateUser$1> aVar) {
        super(aVar);
        this.f33373c = editProfileInteractor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f33372b = obj;
        this.f33374d |= Integer.MIN_VALUE;
        return this.f33373c.a(null, null, 0, this);
    }
}
