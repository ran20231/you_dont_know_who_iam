package com.forsale.app.routing.deeplinks.processors;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CategoriesLinkProcessor.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.routing.deeplinks.processors.CategoriesLinkProcessor", f = "CategoriesLinkProcessor.kt", l = {35}, m = "execute")
/* loaded from: classes2.dex */
public final class CategoriesLinkProcessor$execute$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f37678a;

    /* renamed from: b  reason: collision with root package name */
    Object f37679b;

    /* renamed from: c  reason: collision with root package name */
    /* synthetic */ Object f37680c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ CategoriesLinkProcessor f37681d;

    /* renamed from: e  reason: collision with root package name */
    int f37682e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CategoriesLinkProcessor$execute$1(CategoriesLinkProcessor categoriesLinkProcessor, zz.a<? super CategoriesLinkProcessor$execute$1> aVar) {
        super(aVar);
        this.f37681d = categoriesLinkProcessor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f37680c = obj;
        this.f37682e |= Integer.MIN_VALUE;
        return this.f37681d.a(null, null, null, null, this);
    }
}
