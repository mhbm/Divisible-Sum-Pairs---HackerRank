if __name__ == '__main__':
    firstLine = input().split(" ")
    numberMovilianos = int(firstLine[0])
    numberLotes = int(firstLine[1])
    pontuationMovilianos = [0] * numberMovilianos
    for x in range(0, numberLotes):
        line = input().split(" ");
        posInitial = int(line[0])
        posFinal = int(line[1])
        pontuation = int(line[2])
        pontuationMovilianos[posInitial-1] += pontuation
        if (posFinal < numberMovilianos):
            pontuationMovilianos[posFinal] -= pontuation
    max = x = 0
    for i in pontuationMovilianos:
        x=x+i;
        if(max<x): max=x;
    
    print(max)
