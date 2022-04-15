import { weapons, player1, player2, playRound } from "../scripts/rps";

describe("Tests weapons array from the RPS project", () => {
    test("Check to see if weapons array is length of 3", () => {
        expect(weapons).toHaveLength(3);
    })
});

describe("Tests the player objects from RPS project", () => {
    test("Check to see if player1 score starts at zero", () => {
        expect(player1.score).toBe(0);
    });
    test("Check to see if player2 score starts at zero", () => {
        expect(player2.score).toEqual(0);
    });
});


describe("Tests the playRound from RPS project", () => {
    test("Check to see playRound returns something", () => {
        expect(playRound(player1, player2)).toBeTruthy();
    });
});

describe("Tests the mock getHand from RPS project", () => {

    let mockGetHands;

    beforeEach(() => {
        mockGetHands = jest.fn();
        playRound(player1, player2);
        mockGetHands();
    });

    test("Check to see mock getHands is called", () => {
        expect(mockGetHands).toHaveBeenCalled();
    });

    test("Check to see mock getHands returns something", () => {
        expect(mockGetHands).toHaveReturned();
    });
});

