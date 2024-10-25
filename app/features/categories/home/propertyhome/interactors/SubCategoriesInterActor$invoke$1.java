package com.forsale.app.features.categories.home.propertyhome.interactors;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SubCategoriesInterActor.kt */
@d(c = "com.forsale.app.features.categories.home.propertyhome.interactors.SubCategoriesInterActor", f = "SubCategoriesInterActor.kt", l = {19, 17}, m = "invoke")
/* loaded from: classes2.dex */
public final class SubCategoriesInterActor$invoke$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f25075a;

    /* renamed from: b  reason: collision with root package name */
    int f25076b;

    /* renamed from: c  reason: collision with root package name */
    /* synthetic */ Object f25077c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ SubCategoriesInterActor f25078d;

    /* renamed from: e  reason: collision with root package name */
    int f25079e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubCategoriesInterActor$invoke$1(SubCategoriesInterActor subCategoriesInterActor, a<? super SubCategoriesInterActor$invoke$1> aVar) {
        super(aVar);
        this.f25078d = subCategoriesInterActor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f25077c = obj;
        this.f25079e |= Integer.MIN_VALUE;
        return this.f25078d.a(0, this);
    }
}
