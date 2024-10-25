package com.forsale.app.features.search;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AutoCompleteSearchInterActor.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.search.AutoCompleteSearchInterActor", f = "AutoCompleteSearchInterActor.kt", l = {19, 20}, m = "getAutoCompleteSearch")
/* loaded from: classes2.dex */
public final class AutoCompleteSearchInterActor$getAutoCompleteSearch$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f36455a;

    /* renamed from: b  reason: collision with root package name */
    Object f36456b;

    /* renamed from: c  reason: collision with root package name */
    /* synthetic */ Object f36457c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ AutoCompleteSearchInterActor f36458d;

    /* renamed from: e  reason: collision with root package name */
    int f36459e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutoCompleteSearchInterActor$getAutoCompleteSearch$1(AutoCompleteSearchInterActor autoCompleteSearchInterActor, zz.a<? super AutoCompleteSearchInterActor$getAutoCompleteSearch$1> aVar) {
        super(aVar);
        this.f36458d = autoCompleteSearchInterActor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f36457c = obj;
        this.f36459e |= Integer.MIN_VALUE;
        return this.f36458d.a(null, this);
    }
}
