package com.forsale.app.features.categories.listingdetails.buyerscreen.interactors;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FavoriteInteractor.kt */
@d(c = "com.forsale.app.features.categories.listingdetails.buyerscreen.interactors.FavoriteInteractor", f = "FavoriteInteractor.kt", l = {17}, m = "removeFavorites")
/* loaded from: classes2.dex */
public final class FavoriteInteractor$removeFavorites$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    /* synthetic */ Object f25933a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ FavoriteInteractor f25934b;

    /* renamed from: c  reason: collision with root package name */
    int f25935c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FavoriteInteractor$removeFavorites$1(FavoriteInteractor favoriteInteractor, zz.a<? super FavoriteInteractor$removeFavorites$1> aVar) {
        super(aVar);
        this.f25934b = favoriteInteractor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f25933a = obj;
        this.f25935c |= Integer.MIN_VALUE;
        return this.f25934b.b(null, this);
    }
}
