package com.forsale.app.datalayer.repositories;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.drawable.Drawable;
import e00.k;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import kotlin.jvm.internal.o;
import kotlin.text.d;
/* compiled from: ApplicationResourcesRepository.kt */
/* loaded from: classes2.dex */
public final class ApplicationResourcesRepository {
    public static final int $stable = 8;
    private final Context applicationContext;

    public ApplicationResourcesRepository(Context applicationContext) {
        o.i(applicationContext, "applicationContext");
        this.applicationContext = applicationContext;
    }

    public final int getColor(int i11) {
        return androidx.core.content.b.getColor(this.applicationContext, i11);
    }

    public final int getDimension(int i11) {
        return (int) this.applicationContext.getResources().getDimension(i11);
    }

    public final Drawable getDrawable(int i11) {
        Drawable drawable = androidx.core.content.b.getDrawable(this.applicationContext, i11);
        o.f(drawable);
        return drawable;
    }

    public final int getInteger(int i11) {
        return this.applicationContext.getResources().getInteger(i11);
    }

    public final String getQuantityString(int i11, int i12, Object... args) {
        boolean z11;
        o.i(args, "args");
        if (args.length == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            String quantityString = this.applicationContext.getResources().getQuantityString(i11, i12);
            o.h(quantityString, "getQuantityString(...)");
            return quantityString;
        }
        String quantityString2 = this.applicationContext.getResources().getQuantityString(i11, i12, Arrays.copyOf(args, args.length));
        o.h(quantityString2, "getQuantityString(...)");
        return quantityString2;
    }

    public final String getString(int i11, Object... args) {
        boolean z11;
        o.i(args, "args");
        if (args.length == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            String string = this.applicationContext.getString(i11);
            o.h(string, "getString(...)");
            return string;
        }
        String string2 = this.applicationContext.getString(i11, Arrays.copyOf(args, args.length));
        o.h(string2, "getString(...)");
        return string2;
    }

    public final String[] getStringArr(int i11) {
        String[] stringArray = this.applicationContext.getResources().getStringArray(i11);
        o.h(stringArray, "getStringArray(...)");
        return stringArray;
    }

    public final String readJsonFile(String fileName) {
        BufferedReader bufferedReader;
        o.i(fileName, "fileName");
        AssetManager assets = this.applicationContext.getAssets();
        InputStream open = assets.open(fileName + ".json");
        o.h(open, "open(...)");
        InputStreamReader inputStreamReader = new InputStreamReader(open, d.f61861b);
        if (inputStreamReader instanceof BufferedReader) {
            bufferedReader = (BufferedReader) inputStreamReader;
        } else {
            bufferedReader = new BufferedReader(inputStreamReader, 8192);
        }
        try {
            String c11 = k.c(bufferedReader);
            e00.b.a(bufferedReader, null);
            return c11;
        } finally {
        }
    }
}
